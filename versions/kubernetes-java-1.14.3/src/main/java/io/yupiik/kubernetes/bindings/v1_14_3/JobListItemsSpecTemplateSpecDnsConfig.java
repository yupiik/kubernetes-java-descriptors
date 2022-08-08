package io.yupiik.kubernetes.bindings.v1_14_3;

import java.util.List;
import java.util.Objects;

public class JobListItemsSpecTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<JobListItemsSpecTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public JobListItemsSpecTemplateSpecDnsConfig() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecDnsConfig(final List<String> nameservers,
                                                 final List<JobListItemsSpecTemplateSpecDnsConfigOptions> options,
                                                 final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<JobListItemsSpecTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<JobListItemsSpecTemplateSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecDnsConfig)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecDnsConfig __otherCasted = (JobListItemsSpecTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
