package io.yupiik.kubernetes.bindings.v1_17_0.v1beta1;

import java.util.Objects;

public class DeploymentListItemsSpecRollbackTo {
    private Integer revision;

    public DeploymentListItemsSpecRollbackTo() {
        // no-op
    }

    public DeploymentListItemsSpecRollbackTo(final Integer revision) {
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
        if (!(__other instanceof DeploymentListItemsSpecRollbackTo)) {
            return false;
        }
        final DeploymentListItemsSpecRollbackTo __otherCasted = (DeploymentListItemsSpecRollbackTo) __other;
        return Objects.equals(revision, __otherCasted.revision);
    }
}
