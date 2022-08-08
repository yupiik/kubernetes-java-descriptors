package io.yupiik.kubernetes.bindings.v1_21_5;

import java.util.Objects;

public class DeploymentSpecTemplateSpecContainersLifecyclePostStart {
    private DeploymentSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private DeploymentSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private DeploymentSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public DeploymentSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePostStart(final DeploymentSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                                  final DeploymentSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                  final DeploymentSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DeploymentSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final DeploymentSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (DeploymentSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
