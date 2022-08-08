package io.yupiik.kubernetes.bindings.v1_22_0.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecInitContainersLifecyclePostStart {
    private DeploymentSpecTemplateSpecInitContainersLifecyclePostStartExec exec;
    private DeploymentSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet;
    private DeploymentSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket;

    public DeploymentSpecTemplateSpecInitContainersLifecyclePostStart() {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersLifecyclePostStart(final DeploymentSpecTemplateSpecInitContainersLifecyclePostStartExec exec,
                                                                      final DeploymentSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet,
                                                                      final DeploymentSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentSpecTemplateSpecInitContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public DeploymentSpecTemplateSpecInitContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentSpecTemplateSpecInitContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DeploymentSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentSpecTemplateSpecInitContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecInitContainersLifecyclePostStart)) {
            return false;
        }
        final DeploymentSpecTemplateSpecInitContainersLifecyclePostStart __otherCasted = (DeploymentSpecTemplateSpecInitContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
