package io.yupiik.kubernetes.bindings.v1_14_4.v1beta2;

import io.yupiik.kubernetes.bindings.v1_14_4.Validable;
import io.yupiik.kubernetes.bindings.v1_14_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DownwardAPIProjection implements Validable<DownwardAPIProjection> {
    private List<DownwardAPIVolumeFile> items;

    public DownwardAPIProjection() {
        // no-op
    }

    public DownwardAPIProjection(final List<DownwardAPIVolumeFile> items) {
        // no-op
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
                items);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DownwardAPIProjection)) {
            return false;
        }
        final DownwardAPIProjection __otherCasted = (DownwardAPIProjection) __other;
        return Objects.equals(items, __otherCasted.items);
    }

    public DownwardAPIProjection items(final List<DownwardAPIVolumeFile> items) {
        this.items = items;
        return this;
    }

    @Override
    public DownwardAPIProjection validate() {
        return this;
    }
}
