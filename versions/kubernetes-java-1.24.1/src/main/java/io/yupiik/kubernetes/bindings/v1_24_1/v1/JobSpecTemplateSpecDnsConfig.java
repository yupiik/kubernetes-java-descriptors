package io.yupiik.kubernetes.bindings.v1_24_1.v1;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<JobSpecTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public JobSpecTemplateSpecDnsConfig() {
        // no-op
    }

    public JobSpecTemplateSpecDnsConfig(final List<String> nameservers,
                                        final List<JobSpecTemplateSpecDnsConfigOptions> options,
                                        final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<JobSpecTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<JobSpecTemplateSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof JobSpecTemplateSpecDnsConfig)) {
            return false;
        }
        final JobSpecTemplateSpecDnsConfig __otherCasted = (JobSpecTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
