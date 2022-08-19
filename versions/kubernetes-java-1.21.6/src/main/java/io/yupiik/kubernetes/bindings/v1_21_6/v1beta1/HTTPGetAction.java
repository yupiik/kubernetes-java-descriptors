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
package io.yupiik.kubernetes.bindings.v1_21_6.v1beta1;

import io.yupiik.kubernetes.bindings.v1_21_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_21_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_21_6.Validable;
import io.yupiik.kubernetes.bindings.v1_21_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class HTTPGetAction implements Validable<HTTPGetAction>, Exportable {
    private String host;
    private List<HTTPHeader> httpHeaders;
    private String path;
    private String port;
    private String scheme;

    public HTTPGetAction() {
        // no-op
    }

    public HTTPGetAction(final String host,
                         final List<HTTPHeader> httpHeaders,
                         final String path,
                         final String port,
                         final String scheme) {
        this.host = host;
        this.httpHeaders = httpHeaders;
        this.path = path;
        this.port = port;
        this.scheme = scheme;
    }

    public String getHost() {
        return host;
    }

    public void setHost(final String host) {
        this.host = host;
    }

    public List<HTTPHeader> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(final List<HTTPHeader> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getPort() {
        return port;
    }

    public void setPort(final String port) {
        this.port = port;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(final String scheme) {
        this.scheme = scheme;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                host,
                httpHeaders,
                path,
                port,
                scheme);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof HTTPGetAction)) {
            return false;
        }
        final HTTPGetAction __otherCasted = (HTTPGetAction) __other;
        return Objects.equals(host, __otherCasted.host) &&
            Objects.equals(httpHeaders, __otherCasted.httpHeaders) &&
            Objects.equals(path, __otherCasted.path) &&
            Objects.equals(port, __otherCasted.port) &&
            Objects.equals(scheme, __otherCasted.scheme);
    }

    public HTTPGetAction host(final String host) {
        this.host = host;
        return this;
    }

    public HTTPGetAction httpHeaders(final List<HTTPHeader> httpHeaders) {
        this.httpHeaders = httpHeaders;
        return this;
    }

    public HTTPGetAction path(final String path) {
        this.path = path;
        return this;
    }

    public HTTPGetAction port(final String port) {
        this.port = port;
        return this;
    }

    public HTTPGetAction scheme(final String scheme) {
        this.scheme = scheme;
        return this;
    }

    @Override
    public HTTPGetAction validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (port == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "port", "port",
                "Missing 'port' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (host != null ? "\"host\":\"" +  JsonStrings.escapeJson(host) + "\"" : ""),
                    (httpHeaders != null ? "\"httpHeaders\":" + httpHeaders.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (path != null ? "\"path\":\"" +  JsonStrings.escapeJson(path) + "\"" : ""),
                    (port != null ? "\"port\":\"" +  JsonStrings.escapeJson(port) + "\"" : ""),
                    (scheme != null ? "\"scheme\":\"" +  JsonStrings.escapeJson(scheme) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
