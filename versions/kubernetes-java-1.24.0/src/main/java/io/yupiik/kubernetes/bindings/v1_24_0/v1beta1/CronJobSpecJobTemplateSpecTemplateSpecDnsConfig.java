package io.yupiik.kubernetes.bindings.v1_24_0.v1beta1;

import java.util.List;
import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<CronJobSpecJobTemplateSpecTemplateSpecDnsConfigOptions> options;
    private List<String> searches;

    public CronJobSpecJobTemplateSpecTemplateSpecDnsConfig() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecDnsConfig(final List<String> nameservers,
                                                           final List<CronJobSpecJobTemplateSpecTemplateSpecDnsConfigOptions> options,
                                                           final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<CronJobSpecJobTemplateSpecTemplateSpecDnsConfigOptions> getOptions() {
        return options;
    }

    public void setOptions(final List<CronJobSpecJobTemplateSpecTemplateSpecDnsConfigOptions> options) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecDnsConfig)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecDnsConfig __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
