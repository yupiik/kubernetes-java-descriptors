package io.yupiik.kubernetes.bindings.v1_8_4.v1;

import io.yupiik.kubernetes.bindings.v1_8_4.Validable;
import io.yupiik.kubernetes.bindings.v1_8_4.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResourceQuotaSpec implements Validable<ResourceQuotaSpec> {
    private JsonObject hard;
    private List<String> scopes;

    public ResourceQuotaSpec() {
        // no-op
    }

    public ResourceQuotaSpec(final JsonObject hard,
                             final List<String> scopes) {
        // no-op
    }

    public JsonObject getHard() {
        return hard;
    }

    public void setHard(final JsonObject hard) {
        this.hard = hard;
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
                scopes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceQuotaSpec)) {
            return false;
        }
        final ResourceQuotaSpec __otherCasted = (ResourceQuotaSpec) __other;
        return Objects.equals(hard, __otherCasted.hard) &&
            Objects.equals(scopes, __otherCasted.scopes);
    }

    public ResourceQuotaSpec hard(final JsonObject hard) {
        this.hard = hard;
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
