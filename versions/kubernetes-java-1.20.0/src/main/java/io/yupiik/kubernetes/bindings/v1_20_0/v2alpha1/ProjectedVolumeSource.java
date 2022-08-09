package io.yupiik.kubernetes.bindings.v1_20_0.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_20_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_0.Validable;
import io.yupiik.kubernetes.bindings.v1_20_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ProjectedVolumeSource implements Validable<ProjectedVolumeSource>, Exportable {
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
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (defaultMode != null ? "\"defaultMode\":" + defaultMode : ""),
                    (sources != null ? "\"sources\":" + sources.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
