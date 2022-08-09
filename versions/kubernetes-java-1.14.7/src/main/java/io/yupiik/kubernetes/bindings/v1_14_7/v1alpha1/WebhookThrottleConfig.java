package io.yupiik.kubernetes.bindings.v1_14_7.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_14_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_14_7.Validable;
import io.yupiik.kubernetes.bindings.v1_14_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class WebhookThrottleConfig implements Validable<WebhookThrottleConfig>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (burst != null ? "\"burst\":" + burst : ""),
                    (qps != null ? "\"qps\":" + qps : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
