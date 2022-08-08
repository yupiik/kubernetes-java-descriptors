package io.yupiik.kubernetes.bindings.v1_8_9.v1beta1;

import java.util.Objects;

public class DeploymentSpecRollbackTo {
    private Integer revision;

    public DeploymentSpecRollbackTo() {
        // no-op
    }

    public DeploymentSpecRollbackTo(final Integer revision) {
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
        if (!(__other instanceof DeploymentSpecRollbackTo)) {
            return false;
        }
        final DeploymentSpecRollbackTo __otherCasted = (DeploymentSpecRollbackTo) __other;
        return Objects.equals(revision, __otherCasted.revision);
    }
}
