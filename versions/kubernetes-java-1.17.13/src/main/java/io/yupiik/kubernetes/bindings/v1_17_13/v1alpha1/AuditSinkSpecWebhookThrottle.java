package io.yupiik.kubernetes.bindings.v1_17_13.v1alpha1;

import java.util.Objects;

public class AuditSinkSpecWebhookThrottle {
    private Integer burst;
    private Integer qps;

    public AuditSinkSpecWebhookThrottle() {
        // no-op
    }

    public AuditSinkSpecWebhookThrottle(final Integer burst,
                                        final Integer qps) {
        // no-op
    }

    public Integer getBurst() {
        return burst;
    }

    public void setBurst(final Integer burst) {
        this.burst = burst;
    }

    public Integer getQps() {
        return qps;
    }

    public void setQps(final Integer qps) {
        this.qps = qps;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                burst,
                qps);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AuditSinkSpecWebhookThrottle)) {
            return false;
        }
        final AuditSinkSpecWebhookThrottle __otherCasted = (AuditSinkSpecWebhookThrottle) __other;
        return Objects.equals(burst, __otherCasted.burst) &&
            Objects.equals(qps, __otherCasted.qps);
    }
}
