package io.yupiik.kubernetes.bindings.v1_16_6.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_16_6.Validable;
import io.yupiik.kubernetes.bindings.v1_16_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WebhookThrottleConfig implements Validable<WebhookThrottleConfig> {
    private Integer burst;
    private Integer qps;

    public WebhookThrottleConfig() {
        // no-op
    }

    public WebhookThrottleConfig(final Integer burst,
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
        if (!(__other instanceof WebhookThrottleConfig)) {
            return false;
        }
        final WebhookThrottleConfig __otherCasted = (WebhookThrottleConfig) __other;
        return Objects.equals(burst, __otherCasted.burst) &&
            Objects.equals(qps, __otherCasted.qps);
    }

    public WebhookThrottleConfig burst(final Integer burst) {
        this.burst = burst;
        return this;
    }

    public WebhookThrottleConfig qps(final Integer qps) {
        this.qps = qps;
        return this;
    }

    @Override
    public WebhookThrottleConfig validate() {
        return this;
    }
}
