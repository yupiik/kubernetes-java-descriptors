package io.yupiik.kubernetes.bindings.v1_15_3;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef {
    private String apiVersion;
    private String fieldPath;

    public JobListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef(final String apiVersion,
                                                                       final String fieldPath) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getFieldPath() {
        return fieldPath;
    }

    public void setFieldPath(final String fieldPath) {
        this.fieldPath = fieldPath;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                fieldPath);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef __otherCasted = (JobListItemsSpecTemplateSpecVolumesDownwardAPIItemsFieldRef) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(fieldPath, __otherCasted.fieldPath);
    }
}
