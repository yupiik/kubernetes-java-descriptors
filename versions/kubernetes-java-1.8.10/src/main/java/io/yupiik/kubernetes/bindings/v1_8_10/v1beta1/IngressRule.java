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
package io.yupiik.kubernetes.bindings.v1_8_10.v1beta1;

import io.yupiik.kubernetes.bindings.v1_8_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_10.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressRule implements Validable<IngressRule>, Exportable {
    private String host;
    private HTTPIngressRuleValue http;

    public IngressRule() {
        // no-op
    }

    public IngressRule(final String host,
                       final HTTPIngressRuleValue http) {
        this.host = host;
        this.http = http;
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public HTTPIngressRuleValue getHttp() {
        return http;
    }

    public void setHttp(final HTTPIngressRuleValue http) {
        this.http = http;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                host,
                http);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressRule)) {
            return false;
        }
        final IngressRule __otherCasted = (IngressRule) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(http, __otherCasted.http);
    }

    public IngressRule host(final String host) {
        this.host = host;
        return this;
    }

    public IngressRule http(final HTTPIngressRuleValue http) {
        this.http = http;
        return this;
    }

    @Override
    public IngressRule validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (host != null ? "\"host\":\"" +  JsonStrings.escapeJson(host) + "\"" : ""),
                    (http != null ? "\"http\":" + http.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
