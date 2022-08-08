package io.yupiik.kubernetes.bindings.v1_22_7.v1;

import java.util.List;
import java.util.Objects;

public class JobStatusUncountedTerminatedPods {
    private List<String> failed;
    private List<String> succeeded;

    public JobStatusUncountedTerminatedPods() {
        // no-op
    }

    public JobStatusUncountedTerminatedPods(final List<String> failed,
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
        if (!(__other instanceof JobStatusUncountedTerminatedPods)) {
            return false;
        }
        final JobStatusUncountedTerminatedPods __otherCasted = (JobStatusUncountedTerminatedPods) __other;
        return Objects.equals(failed, __otherCasted.failed) &&
            Objects.equals(succeeded, __otherCasted.succeeded);
    }
}
