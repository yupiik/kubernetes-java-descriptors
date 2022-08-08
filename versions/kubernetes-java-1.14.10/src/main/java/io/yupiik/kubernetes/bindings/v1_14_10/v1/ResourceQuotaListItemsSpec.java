package io.yupiik.kubernetes.bindings.v1_14_10.v1;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ResourceQuotaListItemsSpec {
    private Map<String, String> hard;
    private ResourceQuotaListItemsSpecScopeSelector scopeSelector;
    private List<String> scopes;

    public ResourceQuotaListItemsSpec() {
        // no-op
    }

    public ResourceQuotaListItemsSpec(final Map<String, String> hard,
                                      final ResourceQuotaListItemsSpecScopeSelector scopeSelector,
                                      final List<String> scopes) {
        // no-op
    }

    public Map<String, String> getHard() {
        return hard;
    }

    public void setHard(final Map<String, String> hard) {
        this.hard = hard;
    }

    public ResourceQuotaListItemsSpecScopeSelector getScopeSelector() {
        return scopeSelector;
    }

    public void setScopeSelector(final ResourceQuotaListItemsSpecScopeSelector scopeSelector) {
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
        if (!(__other instanceof ResourceQuotaListItemsSpec)) {
            return false;
        }
        final ResourceQuotaListItemsSpec __otherCasted = (ResourceQuotaListItemsSpec) __other;
        return Objects.equals(hard, __otherCasted.hard) &&
            Objects.equals(scopeSelector, __otherCasted.scopeSelector) &&
            Objects.equals(scopes, __otherCasted.scopes);
    }
}
