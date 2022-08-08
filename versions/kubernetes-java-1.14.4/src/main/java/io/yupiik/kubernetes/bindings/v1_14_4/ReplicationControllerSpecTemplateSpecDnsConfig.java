package io.yupiik.kubernetes.bindings.v1_14_4;

import java.util.List;
import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<ReplicationControllerSpecTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public ReplicationControllerSpecTemplateSpecDnsConfig() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecDnsConfig(final List<String> nameservers,
                                                          final List<ReplicationControllerSpecTemplateSpecDnsConfigOptions> options,
                                                          final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<ReplicationControllerSpecTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<ReplicationControllerSpecTemplateSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecDnsConfig)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecDnsConfig __otherCasted = (ReplicationControllerSpecTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
