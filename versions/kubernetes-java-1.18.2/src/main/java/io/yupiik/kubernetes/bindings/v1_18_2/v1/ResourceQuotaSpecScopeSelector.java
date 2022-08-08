package io.yupiik.kubernetes.bindings.v1_18_2.v1;

import java.util.List;
import java.util.Objects;

public class ResourceQuotaSpecScopeSelector {
    private List<ResourceQuotaSpecScopeSelectorMatchExpressions> matchExpressions;

    public ResourceQuotaSpecScopeSelector() {
        // no-op
    }

    public ResourceQuotaSpecScopeSelector(final List<ResourceQuotaSpecScopeSelectorMatchExpressions> matchExpressions) {
        // no-op
    }

    public List<ResourceQuotaSpecScopeSelectorMatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(final List<ResourceQuotaSpecScopeSelectorMatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                matchExpressions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceQuotaSpecScopeSelector)) {
            return false;
        }
        final ResourceQuotaSpecScopeSelector __otherCasted = (ResourceQuotaSpecScopeSelector) __other;
        return Objects.equals(matchExpressions, __otherCasted.matchExpressions);
    }
}
