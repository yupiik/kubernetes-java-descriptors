package io.yupiik.kubernetes.bindings.v1_17_13.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_17_13.Validable;
import io.yupiik.kubernetes.bindings.v1_17_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProjectedVolumeSource implements Validable<ProjectedVolumeSource> {
    private Integer defaultMode;
    private List<VolumeProjection> sources;

    public ProjectedVolumeSource() {
        // no-op
    }

    public ProjectedVolumeSource(final Integer defaultMode,
                                 final List<VolumeProjection> sources) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<VolumeProjection> getSources() {
        return sources;
    }

    public void setSources(final List<VolumeProjection> sources) {
        this.sources = sources;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                defaultMode,
                sources);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ProjectedVolumeSource)) {
            return false;
        }
        final ProjectedVolumeSource __otherCasted = (ProjectedVolumeSource) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(sources, __otherCasted.sources);
    }

    public ProjectedVolumeSource defaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
        return this;
    }

    public ProjectedVolumeSource sources(final List<VolumeProjection> sources) {
        this.sources = sources;
        return this;
    }

    @Override
    public ProjectedVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (sources == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "sources", "sources",
                "Missing 'sources' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
