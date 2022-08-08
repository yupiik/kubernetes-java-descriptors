package io.yupiik.kubernetes.bindings.v1_8_8.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_8_8.Validable;
import io.yupiik.kubernetes.bindings.v1_8_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExternalAdmissionHook implements Validable<ExternalAdmissionHook> {
    private AdmissionHookClientConfig clientConfig;
    private String failurePolicy;
    private String name;
    private List<RuleWithOperations> rules;

    public ExternalAdmissionHook() {
        // no-op
    }

    public ExternalAdmissionHook(final AdmissionHookClientConfig clientConfig,
                                 final String failurePolicy,
                                 final String name,
                                 final List<RuleWithOperations> rules) {
        // no-op
    }

    public AdmissionHookClientConfig getClientConfig() {
        return clientConfig;
    }

    public void setClientConfig(final AdmissionHookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    public String getFailurePolicy() {
        return failurePolicy;
    }

    public void setFailurePolicy(final String failurePolicy) {
        this.failurePolicy = failurePolicy;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<RuleWithOperations> getRules() {
        return rules;
    }

    public void setRules(final List<RuleWithOperations> rules) {
        this.rules = rules;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                clientConfig,
                failurePolicy,
                name,
                rules);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ExternalAdmissionHook)) {
            return false;
        }
        final ExternalAdmissionHook __otherCasted = (ExternalAdmissionHook) __other;
        return Objects.equals(clientConfig, __otherCasted.clientConfig) &&
            Objects.equals(failurePolicy, __otherCasted.failurePolicy) &&
            Objects.equals(name, __otherCasted.name) &&
            Objects.equals(rules, __otherCasted.rules);
    }

    public ExternalAdmissionHook clientConfig(final AdmissionHookClientConfig clientConfig) {
        this.clientConfig = clientConfig;
        return this;
    }

    public ExternalAdmissionHook failurePolicy(final String failurePolicy) {
        this.failurePolicy = failurePolicy;
        return this;
    }

    public ExternalAdmissionHook name(final String name) {
        this.name = name;
        return this;
    }

    public ExternalAdmissionHook rules(final List<RuleWithOperations> rules) {
        this.rules = rules;
        return this;
    }

    @Override
    public ExternalAdmissionHook validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (clientConfig == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "clientConfig", "clientConfig",
                "Missing 'clientConfig' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
