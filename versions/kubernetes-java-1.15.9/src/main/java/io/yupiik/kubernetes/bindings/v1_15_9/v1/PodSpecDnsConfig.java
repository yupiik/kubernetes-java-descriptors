package io.yupiik.kubernetes.bindings.v1_15_9.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecDnsConfig {
    private List<String> nameservers;
    private List<PodSpecDnsConfigOptions> options;
    private List<String> searches;

    public PodSpecDnsConfig() {
        // no-op
    }

    public PodSpecDnsConfig(final List<String> nameservers,
                            final List<PodSpecDnsConfigOptions> options,
                            final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<PodSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<PodSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof PodSpecDnsConfig)) {
            return false;
        }
        final PodSpecDnsConfig __otherCasted = (PodSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
