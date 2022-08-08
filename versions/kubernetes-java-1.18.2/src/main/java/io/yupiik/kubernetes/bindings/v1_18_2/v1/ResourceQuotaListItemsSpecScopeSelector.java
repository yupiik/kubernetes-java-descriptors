package io.yupiik.kubernetes.bindings.v1_18_2.v1;

import java.util.List;
import java.util.Objects;

public class ResourceQuotaListItemsSpecScopeSelector {
    private List<ResourceQuotaListItemsSpecScopeSelectorMatchExpressions> matchExpressions;

    public ResourceQuotaListItemsSpecScopeSelector() {
        // no-op
    }

    public ResourceQuotaListItemsSpecScopeSelector(final List<ResourceQuotaListItemsSpecScopeSelectorMatchExpressions> matchExpressions) {
        // no-op
    }

    public List<ResourceQuotaListItemsSpecScopeSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ResourceQuotaListItemsSpecScopeSelectorMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchExpressions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceQuotaListItemsSpecScopeSelector)) {
            return false;
        }
        final ResourceQuotaListItemsSpecScopeSelector __otherCasted = (ResourceQuotaListItemsSpecScopeSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions);
    }
}
