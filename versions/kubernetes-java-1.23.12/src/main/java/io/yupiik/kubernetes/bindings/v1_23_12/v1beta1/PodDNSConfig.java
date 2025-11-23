package io.yupiik.kubernetes.bindings.v1_23_12.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_12.Exportable;
import io.yupiik.kubernetes.bindings.v1_23_12.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_23_12.Validable;
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
        this.nameservers = nameservers;
        this.options = options;
        this.searches = searches;
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
