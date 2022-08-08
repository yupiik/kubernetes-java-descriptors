package io.yupiik.kubernetes.bindings.v1_18_3;

import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<DeploymentSpecTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public DeploymentSpecTemplateSpecDnsConfig() {
        // no-op
    }

    public DeploymentSpecTemplateSpecDnsConfig(final List<String> nameservers,
                                               final List<DeploymentSpecTemplateSpecDnsConfigOptions> options,
                                               final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<DeploymentSpecTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<DeploymentSpecTemplateSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecDnsConfig)) {
            return false;
        }
        final DeploymentSpecTemplateSpecDnsConfig __otherCasted = (DeploymentSpecTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
