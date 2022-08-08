package io.yupiik.kubernetes.bindings.v1_22_8.v1;

import io.yupiik.kubernetes.bindings.v1_22_8.Validable;
import io.yupiik.kubernetes.bindings.v1_22_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UncountedTerminatedPods implements Validable<UncountedTerminatedPods> {
    private List<String> failed;
    private List<String> succeeded;

    public UncountedTerminatedPods() {
        // no-op
    }

    public UncountedTerminatedPods(final List<String> failed,
                                   final List<String> succeeded) {
        // no-op
    }

    public List<String> getFailed() {
        return failed;
    }

    public void setFailed(final List<String> failed) {
        this.failed = failed;
    }

    public List<String> getSucceeded() {
        return succeeded;
    }

    public void setSucceeded(final List<String> succeeded) {
        this.succeeded = succeeded;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                failed,
                succeeded);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof UncountedTerminatedPods)) {
            return false;
        }
        final UncountedTerminatedPods __otherCasted = (UncountedTerminatedPods) __other;
        return Objects.equals(failed, __otherCasted.failed) &&
            Objects.equals(succeeded, __otherCasted.succeeded);
    }

    public UncountedTerminatedPods failed(final List<String> failed) {
        this.failed = failed;
        return this;
    }

    public UncountedTerminatedPods succeeded(final List<String> succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    @Override
    public UncountedTerminatedPods validate() {
        return this;
    }
}
