package io.yupiik.kubernetes.bindings.v1_14_8.v1beta1;

import io.yupiik.kubernetes.bindings.v1_14_8.Validable;
import io.yupiik.kubernetes.bindings.v1_14_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DownwardAPIVolumeSource implements Validable<DownwardAPIVolumeSource> {
    private Integer defaultMode;
    private List<DownwardAPIVolumeFile> items;

    public DownwardAPIVolumeSource() {
        // no-op
    }

    public DownwardAPIVolumeSource(final Integer defaultMode,
                                   final List<DownwardAPIVolumeFile> items) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<DownwardAPIVolumeFile> getItems() {
        return items;
    }

    public void setItems(final List<DownwardAPIVolumeFile> items) {
        this.items = items;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                defaultMode,
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DownwardAPIVolumeSource)) {
            return false;
        }
        final DownwardAPIVolumeSource __otherCasted = (DownwardAPIVolumeSource) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items);
    }

    public DownwardAPIVolumeSource defaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
        return this;
    }

    public DownwardAPIVolumeSource items(final List<DownwardAPIVolumeFile> items) {
        this.items = items;
        return this;
    }

    @Override
    public DownwardAPIVolumeSource validate() {
        return this;
    }
}
