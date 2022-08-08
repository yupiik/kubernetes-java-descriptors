package io.yupiik.kubernetes.bindings.v1_19_4.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ResourceQuotaSpec {
    private Map<String, String> hard;
    private ResourceQuotaSpecScopeSelector scopeSelector;
    private List<String> scopes;

    public ResourceQuotaSpec() {
        // no-op
    }

    public ResourceQuotaSpec(final Map<String, String> hard,
                             final ResourceQuotaSpecScopeSelector scopeSelector,
                             final List<String> scopes) {
        // no-op
    }

    public Map<String, String> getHard() {
        return hard;
    }

    public void setHard(final Map<String, String> hard) {
        this.hard = hard;
    }

    public ResourceQuotaSpecScopeSelector getScopeSelector() {
        return scopeSelector;
    }

    public void setScopeSelector(final ResourceQuotaSpecScopeSelector scopeSelector) {
        this.scopeSelector = scopeSelector;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(final List<String> scopes) {
        this.scopes = scopes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hard,
                scopeSelector,
                scopes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceQuotaSpec)) {
            return false;
        }
        final ResourceQuotaSpec __otherCasted = (ResourceQuotaSpec) __other;
        return Objects.equals(hard, __otherCasted.hard) &&
            Objects.equals(scopeSelector, __otherCasted.scopeSelector) &&
            Objects.equals(scopes, __otherCasted.scopes);
    }
}
