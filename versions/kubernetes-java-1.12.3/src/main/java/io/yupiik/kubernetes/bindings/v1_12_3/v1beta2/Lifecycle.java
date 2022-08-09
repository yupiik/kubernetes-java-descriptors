package io.yupiik.kubernetes.bindings.v1_12_3.v1beta2;

import io.yupiik.kubernetes.bindings.v1_12_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_12_3.Validable;
import io.yupiik.kubernetes.bindings.v1_12_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Lifecycle implements Validable<Lifecycle>, Exportable {
    private Handler postStart;
    private Handler preStop;

    public Lifecycle() {
        // no-op
    }

    public Lifecycle(final Handler postStart,
                     final Handler preStop) {
        // no-op
    }

    public Handler getPostStart() {
        return postStart;
    }

    public void setPostStart(final Handler postStart) {
        this.postStart = postStart;
    }

    public Handler getPreStop() {
        return preStop;
    }

    public void setPreStop(final Handler preStop) {
        this.preStop = preStop;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                postStart,
                preStop);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Lifecycle)) {
            return false;
        }
        final Lifecycle __otherCasted = (Lifecycle) __other;
        return Objects.equals(postStart, __otherCasted.postStart) &&
            Objects.equals(preStop, __otherCasted.preStop);
    }

    public Lifecycle postStart(final Handler postStart) {
        this.postStart = postStart;
        return this;
    }

    public Lifecycle preStop(final Handler preStop) {
        this.preStop = preStop;
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
                    (preStop != null ? "\"preStop\":" + preStop.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
