/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
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
package io.yupiik.kubernetes.bindings.v1_9_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_9_5.Exportable;
import io.yupiik.kubernetes.bindings.v1_9_5.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_9_5.Validable;
import io.yupiik.kubernetes.bindings.v1_9_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressTLS implements Validable<IngressTLS>, Exportable {
    private List<String> hosts;
    private String secretName;

    public IngressTLS() {
        // no-op
    }

    public IngressTLS(final List<String> hosts,
                      final String secretName) {
        // no-op
    }

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(final List<String> hosts) {
        this.hosts = hosts;
    }

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(final String secretName) {
        this.secretName = secretName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hosts,
                secretName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressTLS)) {
            return false;
        }
        final IngressTLS __otherCasted = (IngressTLS) __other;
        return Objects.equals(hosts, __otherCasted.hosts) &&
            Objects.equals(secretName, __otherCasted.secretName);
    }

    public IngressTLS hosts(final List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    public IngressTLS secretName(final String secretName) {
        this.secretName = secretName;
        return this;
    }

    @Override
    public IngressTLS validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (hosts != null ? "\"hosts\":" + hosts.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (secretName != null ? "\"secretName\":\"" +  JsonStrings.escapeJson(secretName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
