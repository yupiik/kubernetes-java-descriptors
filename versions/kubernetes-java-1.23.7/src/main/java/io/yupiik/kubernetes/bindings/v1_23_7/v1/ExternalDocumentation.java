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
package io.yupiik.kubernetes.bindings.v1_23_7.v1;

import io.yupiik.kubernetes.bindings.v1_23_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_7.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_7.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ExternalDocumentation implements Validable<ExternalDocumentation>, Exportable {
    private String description;
    private String url;

    public ExternalDocumentation() {
        // no-op
    }

    public ExternalDocumentation(final String description,
                                 final String url) {
        this.description = description;
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                description,
                url);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ExternalDocumentation)) {
            return false;
        }
        final ExternalDocumentation __otherCasted = (ExternalDocumentation) __other;
        return Objects.equals(description, __otherCasted.description) &&
            Objects.equals(url, __otherCasted.url);
    }

    public ExternalDocumentation description(final String description) {
        this.description = description;
        return this;
    }

    public ExternalDocumentation url(final String url) {
        this.url = url;
        return this;
    }

    @Override
    public ExternalDocumentation validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (description != null ? "\"description\":\"" +  JsonStrings.escapeJson(description) + "\"" : ""),
                    (url != null ? "\"url\":\"" +  JsonStrings.escapeJson(url) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
