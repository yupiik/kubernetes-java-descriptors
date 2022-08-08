package io.yupiik.kubernetes.bindings.v1_15_11;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecContainersVolumeMounts {
    private String mountPath;
    private String mountPropagation;
    private String name;
    private Boolean readOnly;
    private String subPath;
    private String subPathExpr;

    public StatefulSetSpecTemplateSpecContainersVolumeMounts() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecContainersVolumeMounts(final String mountPath,
                                                             final String mountPropagation,
                                                             final String name,
                                                             final Boolean readOnly,
                                                             final String subPath,
                                                             final String subPathExpr) {
        // no-op
    }

    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(final String mountPath) {
        this.mountPath = mountPath;
    }

    public String getMountPropagation() {
        return mountPropagation;
    }

    public void setMountPropagation(final String mountPropagation) {
        this.mountPropagation = mountPropagation;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getSubPath() {
        return subPath;
    }

    public void setSubPath(final String subPath) {
        this.subPath = subPath;
    }

    public String getSubPathExpr() {
        return subPathExpr;
    }

    public void setSubPathExpr(final String subPathExpr) {
        this.subPathExpr = subPathExpr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                mountPath,
                mountPropagation,
                name,
                readOnly,
                subPath,
                subPathExpr);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetSpecTemplateSpecContainersVolumeMounts)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecContainersVolumeMounts __otherCasted = (StatefulSetSpecTemplateSpecContainersVolumeMounts) __other;
        return Objects.equals(mountPath, __otherCasted.mountPath) &&
            Objects.equals(mountPropagation, __otherCasted.mountPropagation) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(subPath, __otherCasted.subPath) &&
            Objects.equals(subPathExpr, __otherCasted.subPathExpr);
    }
}
