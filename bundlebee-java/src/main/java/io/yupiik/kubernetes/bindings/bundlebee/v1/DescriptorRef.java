package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class DescriptorRef implements Validable<DescriptorRef>, Exportable {
    private String location;
    private String name;

    public DescriptorRef() {
        // no-op
    }

    public DescriptorRef(final String location,
                         final String name) {
        // no-op
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(final String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                location,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DescriptorRef)) {
            return false;
        }
        final DescriptorRef __otherCasted = (DescriptorRef) __other;
        return Objects.equals(location, __otherCasted.location) &&
            Objects.equals(name, __otherCasted.name);
    }

    public DescriptorRef location(final String location) {
        this.location = location;
        return this;
    }

    public DescriptorRef name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public DescriptorRef validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (location != null ? "\"location\":\"" +  JsonStrings.escapeJson(location) + "\"" : ""),
                    (name != null ? "\"name\":\"" +  JsonStrings.escapeJson(name) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
