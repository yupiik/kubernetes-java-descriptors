package io.yupiik.kubernetes.bindings.v1_16_2;

import java.util.Map;
import java.util.Objects;

public class ResourceQuotaStatus {
    private Map<String, String> hard;
    private Map<String, String> used;

    public ResourceQuotaStatus() {
        // no-op
    }

    public ResourceQuotaStatus(final Map<String, String> hard,
                               final Map<String, String> used) {
        // no-op
    }

    public Map<String, String> getHard() {
        return hard;
    }

    public void setHard(final Map<String, String> hard) {
        this.hard = hard;
    }

    public Map<String, String> getUsed() {
        return used;
    }

    public void setUsed(final Map<String, String> used) {
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
}
