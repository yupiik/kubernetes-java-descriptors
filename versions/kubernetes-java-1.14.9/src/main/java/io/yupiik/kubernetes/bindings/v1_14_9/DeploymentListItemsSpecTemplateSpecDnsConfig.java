package io.yupiik.kubernetes.bindings.v1_14_9;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<DeploymentListItemsSpecTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public DeploymentListItemsSpecTemplateSpecDnsConfig() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecDnsConfig(final List<String> nameservers,
                                                        final List<DeploymentListItemsSpecTemplateSpecDnsConfigOptions> options,
                                                        final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<DeploymentListItemsSpecTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<DeploymentListItemsSpecTemplateSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecDnsConfig)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecDnsConfig __otherCasted = (DeploymentListItemsSpecTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
