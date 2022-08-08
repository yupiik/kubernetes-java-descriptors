package io.yupiik.kubernetes.bindings.v1_16_3;

import java.util.Map;
import java.util.Objects;

public class ResourceQuotaListItemsStatus {
    private Map<String, String> hard;
    private Map<String, String> used;

    public ResourceQuotaListItemsStatus() {
        // no-op
    }

    public ResourceQuotaListItemsStatus(final Map<String, String> hard,
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
        if (!(__other instanceof ResourceQuotaListItemsStatus)) {
            return false;
        }
        final ResourceQuotaListItemsStatus __otherCasted = (ResourceQuotaListItemsStatus) __other;
        return Objects.equals(hard, __otherCasted.hard) &&
            Objects.equals(used, __otherCasted.used);
    }
}
