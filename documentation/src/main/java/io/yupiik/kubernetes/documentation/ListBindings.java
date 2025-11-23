/*
 * Copyright (c) 2022 - present - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.documentation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import static java.util.stream.Collectors.joining;

public class ListBindings implements Runnable {
    private final Path sourceBase;
    private final String ushipVersion;

    public ListBindings(final Path sourceBase, final Map<String, String> configuration) {
        this.sourceBase = sourceBase;
        this.ushipVersion = configuration.get("uship.version");
    }

    @Override
    public void run() {
        try (final var list = Files.list(sourceBase.getParent().getParent().getParent().getParent().resolve("versions"))) {
            final var text = list
                    .filter(it -> Files.isDirectory(it) &&
                            it.getFileName().toString().startsWith("kubernetes-java-") &&
                            Files.exists(it.resolve("pom.xml")))
                    .map(it -> it.getFileName().toString().substring("kubernetes-java-".length()))
                    .sorted((a, b) -> { // reverse order (more recent first)
                        final String[] segments1 = a.split("\\.");
                        final String[] segments2 = b.split("\\.");
                        for (int i = 0; i < Math.min(segments1.length, segments2.length); i++) {
                            final var v1 = Integer.parseInt(segments1[i]);
                            final var v2 = Integer.parseInt(segments2[i]);
                            if (v1 < v2) {
                                return 1;
                            }
                            if (v1 > v2) {
                                return -1;
                            }
                        }
                        return b.compareTo(a);
                    })
                    .map(it -> "" +
                            "== Version " + it + "\n" +
                            "\n" +
                            "This module targets Kubernetes *v" + it + "*.\n" +
                            "\n" +
                            "=== Dependencies\n" +
                            "\n" +
                            "[source,xml]\n" +
                            "----\n" +
                            "<dependency>\n" +
                            "  <groupId>io.yupiik.kubernetes</groupId>\n" +
                            "  <artifactId>kubernetes-java-" + it + "</artifactId>\n" +
                            "  <version>${kubernetes-java-descriptors.version}</version>\n" +
                            "</dependency>\n" +
                            "<dependency> <!-- JSON-P/JSON-B dependencies if needed -->\n" +
                            "  <groupId>io.yupiik.uship</groupId>\n" +
                            "  <artifactId>backbone-johnzon</artifactId>\n" +
                            "  <version>" + ushipVersion + "</version>\n" +
                            "  <type>pom</type>\n" +
                            "</dependency>\n" +
                            "----\n" +
                            "\n")
                    .collect(joining());
            Files.writeString(
                    Files.createDirectories(sourceBase.resolve("content/_partials/generated"))
                            .resolve("bindings.adoc"),
                    text);
        } catch (final IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
