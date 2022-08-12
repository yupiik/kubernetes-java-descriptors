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
package io.yupiik.kubernetes.bindings.v1_14_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_14_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_14_0.Validable;
import io.yupiik.kubernetes.bindings.v1_14_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class PodDNSConfig implements Validable<PodDNSConfig>, Exportable {
    private List<String> nameservers;
    private List<PodDNSConfigOption> options;
    private List<String> searches;

    public PodDNSConfig() {
        // no-op
    }

    public PodDNSConfig(final List<String> nameservers,
                        final List<PodDNSConfigOption> options,
                        final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<PodDNSConfigOption> getOptions() {
        return options;
    }

    public void setOptions(final List<PodDNSConfigOption> options) {
        this.options = options;
    }

    public List<String> getSearches() {
        return searches;
    }

    public void setSearches(final List<String> searches) {
        this.searches = searches;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nameservers,
                options,
                searches);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodDNSConfig)) {
            return false;
        }
        final PodDNSConfig __otherCasted = (PodDNSConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }

    public PodDNSConfig nameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
        return this;
    }

    public PodDNSConfig options(final List<PodDNSConfigOption> options) {
        this.options = options;
        return this;
    }

    public PodDNSConfig searches(final List<String> searches) {
        this.searches = searches;
        return this;
    }

    @Override
    public PodDNSConfig validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (nameservers != null ? "\"nameservers\":" + nameservers.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (options != null ? "\"options\":" + options.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (searches != null ? "\"searches\":" + searches.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
