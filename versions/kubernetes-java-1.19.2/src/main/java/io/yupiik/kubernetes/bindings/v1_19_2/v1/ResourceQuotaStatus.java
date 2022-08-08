package io.yupiik.kubernetes.bindings.v1_19_2.v1;

import io.yupiik.kubernetes.bindings.v1_19_2.Validable;
import io.yupiik.kubernetes.bindings.v1_19_2.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResourceQuotaStatus implements Validable<ResourceQuotaStatus> {
    private JsonObject hard;
    private JsonObject used;

    public ResourceQuotaStatus() {
        // no-op
    }

    public ResourceQuotaStatus(final JsonObject hard,
                               final JsonObject used) {
        // no-op
    }

    public JsonObject getHard() {
        return hard;
    }

    public void setHard(final JsonObject hard) {
        this.hard = hard;
    }

    public JsonObject getUsed() {
        return used;
    }

    public void setUsed(final JsonObject used) {
        this.used = used;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hard,
                used);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ResourceQuotaStatus)) {
            return false;
        }
        final ResourceQuotaStatus __otherCasted = (ResourceQuotaStatus) __other;
        return Objects.equals(hard, __otherCasted.hard) &&
            Objects.equals(used, __otherCasted.used);
    }

    public ResourceQuotaStatus hard(final JsonObject hard) {
        this.hard = hard;
        return this;
    }

    public ResourceQuotaStatus used(final JsonObject used) {
        this.used = used;
        return this;
    }

    @Override
    public ResourceQuotaStatus validate() {
        return this;
    }
}
