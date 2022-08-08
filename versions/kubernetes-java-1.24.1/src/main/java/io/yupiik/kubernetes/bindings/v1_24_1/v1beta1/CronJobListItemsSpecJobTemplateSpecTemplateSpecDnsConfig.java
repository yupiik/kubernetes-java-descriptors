package io.yupiik.kubernetes.bindings.v1_24_1.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<CronJobListItemsSpecJobTemplateSpecTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecDnsConfig() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecDnsConfig(final List<String> nameservers,
                                                                    final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecDnsConfigOptions> options,
                                                                    final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<CronJobListItemsSpecJobTemplateSpecTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<CronJobListItemsSpecJobTemplateSpecTemplateSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecDnsConfig)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecDnsConfig __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
