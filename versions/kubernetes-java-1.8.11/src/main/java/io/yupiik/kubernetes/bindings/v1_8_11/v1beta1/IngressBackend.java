package io.yupiik.kubernetes.bindings.v1_8_11.v1beta1;

import io.yupiik.kubernetes.bindings.v1_8_11.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_11.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_8_11.Validable;
import io.yupiik.kubernetes.bindings.v1_8_11.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class IngressBackend implements Validable<IngressBackend>, Exportable {
    private String serviceName;
    private String servicePort;

    public IngressBackend() {
        // no-op
    }

    public IngressBackend(final String serviceName,
                          final String servicePort) {
        // no-op
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServicePort() {
        return servicePort;
    }

    public void setServicePort(final String servicePort) {
        this.servicePort = servicePort;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                serviceName,
                servicePort);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof IngressBackend)) {
            return false;
        }
        final IngressBackend __otherCasted = (IngressBackend) __other;
        return Objects.equals(serviceName, __otherCasted.serviceName) &&
            Objects.equals(servicePort, __otherCasted.servicePort);
    }

    public IngressBackend serviceName(final String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public IngressBackend servicePort(final String servicePort) {
        this.servicePort = servicePort;
        return this;
    }

    @Override
    public IngressBackend validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (serviceName == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "serviceName", "serviceName",
                "Missing 'serviceName' attribute.", true));
        }
        if (servicePort == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "servicePort", "servicePort",
                "Missing 'servicePort' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (serviceName != null ? "\"serviceName\":\"" +  JsonStrings.escapeJson(serviceName) + "\"" : ""),
                    (servicePort != null ? "\"servicePort\":\"" +  JsonStrings.escapeJson(servicePort) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
