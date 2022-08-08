package io.yupiik.kubernetes.bindings.v1_10_1.v1beta2;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecDnsConfig {
    private List<String> nameservers;
    private List<JsonValue> options;
    private List<String> searches;

    public ReplicaSetSpecTemplateSpecDnsConfig() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecDnsConfig(final List<String> nameservers,
                                               final List<JsonValue> options,
                                               final List<String> searches) {
        // no-op
    }

    public List<String> getNameservers() {
        return nameservers;
    }

    public void setNameservers(final List<String> nameservers) {
        this.nameservers = nameservers;
    }

    public List<JsonValue> getOptions() {
        return options;
    }

    public void setOptions(final List<JsonValue> options) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecDnsConfig)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecDnsConfig __otherCasted = (ReplicaSetSpecTemplateSpecDnsConfig) __other;
        return Objects.equals(nameservers, __otherCasted.nameservers) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(searches, __otherCasted.searches);
    }
}
