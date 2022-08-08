package io.yupiik.kubernetes.bindings.v1_17_9.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<PodTemplateTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public PodTemplateTemplateSpecDnsConfig() {
        // no-op
    }

    public PodTemplateTemplateSpecDnsConfig(final List<String> nameservers,
                                            final List<PodTemplateTemplateSpecDnsConfigOptions> options,
                                            final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<PodTemplateTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<PodTemplateTemplateSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof PodTemplateTemplateSpecDnsConfig)) {
            return false;
        }
        final PodTemplateTemplateSpecDnsConfig __otherCasted = (PodTemplateTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
