/*
 * Copyright (c) 2022 - Yupiik SAS - https://www.yupiik.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.yupiik.kubernetes.bindings.v1_24_1.v1;

import io.yupiik.kubernetes.bindings.v1_24_1.Exportable;
import io.yupiik.kubernetes.bindings.v1_24_1.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_24_1.Validable;
import io.yupiik.kubernetes.bindings.v1_24_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class NodeSystemInfo implements Validable<NodeSystemInfo>, Exportable {
    private String architecture;
    private String bootID;
    private String containerRuntimeVersion;
    private String kernelVersion;
    private String kubeProxyVersion;
    private String kubeletVersion;
    private String machineID;
    private String operatingSystem;
    private String osImage;
    private String systemUUID;

    public NodeSystemInfo() {
        // no-op
    }

    public NodeSystemInfo(final String architecture,
                          final String bootID,
                          final String containerRuntimeVersion,
                          final String kernelVersion,
                          final String kubeProxyVersion,
                          final String kubeletVersion,
                          final String machineID,
                          final String operatingSystem,
                          final String osImage,
                          final String systemUUID) {
        // no-op
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(final String architecture) {
        this.architecture = architecture;
    }

    public String getBootID() {
        return bootID;
    }

    public void setBootID(final String bootID) {
        this.bootID = bootID;
    }

    public String getContainerRuntimeVersion() {
        return containerRuntimeVersion;
    }

    public void setContainerRuntimeVersion(final String containerRuntimeVersion) {
        this.containerRuntimeVersion = containerRuntimeVersion;
    }

    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(final String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public String getKubeProxyVersion() {
        return kubeProxyVersion;
    }

    public void setKubeProxyVersion(final String kubeProxyVersion) {
        this.kubeProxyVersion = kubeProxyVersion;
    }

    public String getKubeletVersion() {
        return kubeletVersion;
    }

    public void setKubeletVersion(final String kubeletVersion) {
        this.kubeletVersion = kubeletVersion;
    }

    public String getMachineID() {
        return machineID;
    }

    public void setMachineID(final String machineID) {
        this.machineID = machineID;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(final String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOsImage() {
        return osImage;
    }

    public void setOsImage(final String osImage) {
        this.osImage = osImage;
    }

    public String getSystemUUID() {
        return systemUUID;
    }

    public void setSystemUUID(final String systemUUID) {
        this.systemUUID = systemUUID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                architecture,
                bootID,
                containerRuntimeVersion,
                kernelVersion,
                kubeProxyVersion,
                kubeletVersion,
                machineID,
                operatingSystem,
                osImage,
                systemUUID);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof NodeSystemInfo)) {
            return false;
        }
        final NodeSystemInfo __otherCasted = (NodeSystemInfo) __other;
        return Objects.equals(architecture, __otherCasted.architecture) &&
            Objects.equals(bootID, __otherCasted.bootID) &&
            Objects.equals(containerRuntimeVersion, __otherCasted.containerRuntimeVersion) &&
            Objects.equals(kernelVersion, __otherCasted.kernelVersion) &&
            Objects.equals(kubeProxyVersion, __otherCasted.kubeProxyVersion) &&
            Objects.equals(kubeletVersion, __otherCasted.kubeletVersion) &&
            Objects.equals(machineID, __otherCasted.machineID) &&
            Objects.equals(operatingSystem, __otherCasted.operatingSystem) &&
            Objects.equals(osImage, __otherCasted.osImage) &&
            Objects.equals(systemUUID, __otherCasted.systemUUID);
    }

    public NodeSystemInfo architecture(final String architecture) {
        this.architecture = architecture;
        return this;
    }

    public NodeSystemInfo bootID(final String bootID) {
        this.bootID = bootID;
        return this;
    }

    public NodeSystemInfo containerRuntimeVersion(final String containerRuntimeVersion) {
        this.containerRuntimeVersion = containerRuntimeVersion;
        return this;
    }

    public NodeSystemInfo kernelVersion(final String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    public NodeSystemInfo kubeProxyVersion(final String kubeProxyVersion) {
        this.kubeProxyVersion = kubeProxyVersion;
        return this;
    }

    public NodeSystemInfo kubeletVersion(final String kubeletVersion) {
        this.kubeletVersion = kubeletVersion;
        return this;
    }

    public NodeSystemInfo machineID(final String machineID) {
        this.machineID = machineID;
        return this;
    }

    public NodeSystemInfo operatingSystem(final String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public NodeSystemInfo osImage(final String osImage) {
        this.osImage = osImage;
        return this;
    }

    public NodeSystemInfo systemUUID(final String systemUUID) {
        this.systemUUID = systemUUID;
        return this;
    }

    @Override
    public NodeSystemInfo validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (architecture == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "architecture", "architecture",
                "Missing 'architecture' attribute.", true));
        }
        if (bootID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "bootID", "bootID",
                "Missing 'bootID' attribute.", true));
        }
        if (containerRuntimeVersion == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "containerRuntimeVersion", "containerRuntimeVersion",
                "Missing 'containerRuntimeVersion' attribute.", true));
        }
        if (kernelVersion == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "kernelVersion", "kernelVersion",
                "Missing 'kernelVersion' attribute.", true));
        }
        if (kubeProxyVersion == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "kubeProxyVersion", "kubeProxyVersion",
                "Missing 'kubeProxyVersion' attribute.", true));
        }
        if (kubeletVersion == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "kubeletVersion", "kubeletVersion",
                "Missing 'kubeletVersion' attribute.", true));
        }
        if (machineID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "machineID", "machineID",
                "Missing 'machineID' attribute.", true));
        }
        if (operatingSystem == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "operatingSystem", "operatingSystem",
                "Missing 'operatingSystem' attribute.", true));
        }
        if (osImage == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "osImage", "osImage",
                "Missing 'osImage' attribute.", true));
        }
        if (systemUUID == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "systemUUID", "systemUUID",
                "Missing 'systemUUID' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (architecture != null ? "\"architecture\":\"" +  JsonStrings.escapeJson(architecture) + "\"" : ""),
                    (bootID != null ? "\"bootID\":\"" +  JsonStrings.escapeJson(bootID) + "\"" : ""),
                    (containerRuntimeVersion != null ? "\"containerRuntimeVersion\":\"" +  JsonStrings.escapeJson(containerRuntimeVersion) + "\"" : ""),
                    (kernelVersion != null ? "\"kernelVersion\":\"" +  JsonStrings.escapeJson(kernelVersion) + "\"" : ""),
                    (kubeProxyVersion != null ? "\"kubeProxyVersion\":\"" +  JsonStrings.escapeJson(kubeProxyVersion) + "\"" : ""),
                    (kubeletVersion != null ? "\"kubeletVersion\":\"" +  JsonStrings.escapeJson(kubeletVersion) + "\"" : ""),
                    (machineID != null ? "\"machineID\":\"" +  JsonStrings.escapeJson(machineID) + "\"" : ""),
                    (operatingSystem != null ? "\"operatingSystem\":\"" +  JsonStrings.escapeJson(operatingSystem) + "\"" : ""),
                    (osImage != null ? "\"osImage\":\"" +  JsonStrings.escapeJson(osImage) + "\"" : ""),
                    (systemUUID != null ? "\"systemUUID\":\"" +  JsonStrings.escapeJson(systemUUID) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
