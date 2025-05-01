# Cookiecutter Spring Boot Template

This is a Cookiecutter template for bootstrapping a Spring Boot microservice with:

- Java 17 + Maven
- Dockerfile for containerization
- Kubernetes manifests for deployment to GKE
- Terraform config for provisioning GKE
- GitHub Actions workflow for CI/CD

## Usage

Install Cookiecutter:

```bash
pip install cookiecutter
```

Generate your new project:

```bash
cookiecutter gh:your-org/cookiecutter-springboot-template
```

You’ll be prompted to enter values like:

- project_name
- project_slug
- java_package
- author_name

Then cd into your generated project and follow the README instructions to build, push, and deploy.
