package io.yupiik.kubernetes.bindings.v1_16_9.v1beta1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStart {
    private DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec;
    private DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet;
    private DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket;

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStart() {
        // no-op
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStart(final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec,
                                                                           final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet,
                                                                           final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStartTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStart)) {
            return false;
        }
        final DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStart __otherCasted = (DeploymentSpecTemplateSpecEphemeralContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
