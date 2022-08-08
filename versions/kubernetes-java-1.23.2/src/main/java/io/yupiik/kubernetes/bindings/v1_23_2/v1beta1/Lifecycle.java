package io.yupiik.kubernetes.bindings.v1_23_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_2.Validable;
import io.yupiik.kubernetes.bindings.v1_23_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lifecycle implements Validable<Lifecycle> {
    private LifecycleHandler postStart;
    private LifecycleHandler preStop;

    public Lifecycle() {
        // no-op
    }

    public Lifecycle(final LifecycleHandler postStart,
                     final LifecycleHandler preStop) {
        // no-op
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

    public Lifecycle postStart(final LifecycleHandler postStart) {
        this.postStart = postStart;
        return this;
    }

    public Lifecycle preStop(final LifecycleHandler preStop) {
        this.preStop = preStop;
        return this;
    }

    @Override
    public Lifecycle validate() {
        return this;
    }
}
