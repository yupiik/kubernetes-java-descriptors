package io.yupiik.kubernetes.bindings.v1_11_6.v1beta2;

import io.yupiik.kubernetes.bindings.v1_11_6.Exportable;
import io.yupiik.kubernetes.bindings.v1_11_6.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_11_6.Validable;
import io.yupiik.kubernetes.bindings.v1_11_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Preconditions implements Validable<Preconditions>, Exportable {
    private String uid;

    public Preconditions() {
        // no-op
    }

    public Preconditions(final String uid) {
        // no-op
    }

    public String getUid() {
        return uid;
    }

    public void setUid(final String uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Preconditions)) {
            return false;
        }
        final Preconditions __otherCasted = (Preconditions) __other;
        return Objects.equals(uid, __otherCasted.uid);
    }

    public Preconditions uid(final String uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public Preconditions validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (uid != null ? "\"uid\":\"" +  JsonStrings.escapeJson(uid) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
