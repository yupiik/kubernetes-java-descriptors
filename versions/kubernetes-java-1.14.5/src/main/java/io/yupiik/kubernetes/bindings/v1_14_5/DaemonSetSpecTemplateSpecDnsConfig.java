package io.yupiik.kubernetes.bindings.v1_14_5;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<DaemonSetSpecTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public DaemonSetSpecTemplateSpecDnsConfig() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecDnsConfig(final List<String> nameservers,
                                              final List<DaemonSetSpecTemplateSpecDnsConfigOptions> options,
                                              final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<DaemonSetSpecTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<DaemonSetSpecTemplateSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecDnsConfig)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecDnsConfig __otherCasted = (DaemonSetSpecTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
