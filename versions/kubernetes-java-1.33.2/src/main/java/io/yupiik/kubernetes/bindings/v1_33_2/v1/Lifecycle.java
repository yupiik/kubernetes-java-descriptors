package io.yupiik.kubernetes.bindings.v1_33_2.v1;

import io.yupiik.kubernetes.bindings.v1_33_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_33_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_33_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Lifecycle implements Validable<Lifecycle>, Exportable {
    private LifecycleHandler postStart;
    private LifecycleHandler preStop;
    private String stopSignal;

    public Lifecycle() {
        // no-op
    }

    public Lifecycle(final LifecycleHandler postStart,
                     final LifecycleHandler preStop,
                     final String stopSignal) {
        this.postStart = postStart;
        this.preStop = preStop;
        this.stopSignal = stopSignal;
    }

    public LifecycleHandler getPostStart() {
        return postStart;
    }

    public void setPostStart(final LifecycleHandler postStart) {
        this.postStart = postStart;
    }

    public LifecycleHandler getPreStop() {
        return preStop;
    }

    public void setPreStop(final LifecycleHandler preStop) {
        this.preStop = preStop;
    }

    public String getStopSignal() {
        return stopSignal;
    }

    public void setStopSignal(final String stopSignal) {
        this.stopSignal = stopSignal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                postStart,
                preStop,
                stopSignal);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Lifecycle)) {
            return false;
        }
        final Lifecycle __otherCasted = (Lifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop) &&
            Objects.equals(stopSignal, __otherCasted.stopSignal);
    }

    public Lifecycle postStart(final LifecycleHandler postStart) {
        this.postStart = postStart;
        return this;
    }

    public Lifecycle preStop(final LifecycleHandler preStop) {
        this.preStop = preStop;
        return this;
    }

    public Lifecycle stopSignal(final String stopSignal) {
        this.stopSignal = stopSignal;
        return this;
    }

    @Override
    public Lifecycle validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (postStart != null ? "\"postStart\":" + postStart.asJson() : ""),
                    (preStop != null ? "\"preStop\":" + preStop.asJson() : ""),
                    (stopSignal != null ? "\"stopSignal\":\"" +  JsonStrings.escapeJson(stopSignal) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
