package io.yupiik.kubernetes.bindings.v1_10_3.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_10_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_3.Validable;
import io.yupiik.kubernetes.bindings.v1_10_3.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DownwardAPIProjection implements Validable<DownwardAPIProjection>, Exportable {
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

    @Override
    public String asJson() {
        return Stream.of(
                    (items != null ? "\"items\":" + items.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
