package io.yupiik.kubernetes.bindings.v1_10_1.v1beta1;

import java.util.Objects;

public class DeploymentRollbackRollbackTo {
    private Integer revision;

    public DeploymentRollbackRollbackTo() {
        // no-op
    }

    public DeploymentRollbackRollbackTo(final Integer revision) {
        // no-op
    }

    public Integer getRevision() {
        return revision;
    }

    public void setRevision(final Integer revision) {
        this.revision = revision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                revision);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentRollbackRollbackTo)) {
            return false;
        }
        final DeploymentRollbackRollbackTo __otherCasted = (DeploymentRollbackRollbackTo) __other;
        return Objects.equals(revision, __otherCasted.revision);
    }
}
