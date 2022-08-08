package io.yupiik.kubernetes.bindings.v1_19_13.v1;

import io.yupiik.kubernetes.bindings.v1_19_13.Validable;
import io.yupiik.kubernetes.bindings.v1_19_13.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResourceQuotaSpec implements Validable<ResourceQuotaSpec> {
    private JsonObject hard;
    private ScopeSelector scopeSelector;
    private List<String> scopes;

    public ResourceQuotaSpec() {
        // no-op
    }

    public ResourceQuotaSpec(final JsonObject hard,
                             final ScopeSelector scopeSelector,
                             final List<String> scopes) {
        // no-op
    }

    public JsonObject getHard() {
        return hard;
    }

    public void setHard(final JsonObject hard) {
        this.hard = hard;
    }

    public ScopeSelector getScopeSelector() {
        return scopeSelector;
    }

    public void setScopeSelector(final ScopeSelector scopeSelector) {
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

    public ResourceQuotaSpec hard(final JsonObject hard) {
        this.hard = hard;
        return this;
    }

    public ResourceQuotaSpec scopeSelector(final ScopeSelector scopeSelector) {
        this.scopeSelector = scopeSelector;
        return this;
    }

    public ResourceQuotaSpec scopes(final List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    @Override
    public ResourceQuotaSpec validate() {
        return this;
    }
}
