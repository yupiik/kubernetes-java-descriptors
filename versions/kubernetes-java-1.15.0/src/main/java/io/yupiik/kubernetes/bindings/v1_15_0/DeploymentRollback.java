package io.yupiik.kubernetes.bindings.v1_15_0;

import java.util.Map;
import java.util.Objects;

public class DeploymentRollback {
    private String apiVersion;
    private String kind;
    private String name;
    private DeploymentRollbackRollbackTo rollbackTo;
    private Map<String, String> updatedAnnotations;

    public DeploymentRollback() {
        // no-op
    }

    public DeploymentRollback(final String apiVersion,
                              final String kind,
                              final String name,
                              final DeploymentRollbackRollbackTo rollbackTo,
                              final Map<String, String> updatedAnnotations) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public DeploymentRollbackRollbackTo getRollbackTo() {
        return rollbackTo;
    }

    public void setRollbackTo(final DeploymentRollbackRollbackTo rollbackTo) {
        this.rollbackTo = rollbackTo;
    }

    public Map<String, String> getUpdatedAnnotations() {
        return updatedAnnotations;
    }

    public void setUpdatedAnnotations(final Map<String, String> updatedAnnotations) {
        this.updatedAnnotations = updatedAnnotations;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                name,
                rollbackTo,
                updatedAnnotations);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentRollback)) {
            return false;
        }
        final DeploymentRollback __otherCasted = (DeploymentRollback) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(rollbackTo, __otherCasted.rollbackTo) &&
            Objects.equals(updatedAnnotations, __otherCasted.updatedAnnotations);
    }
}
