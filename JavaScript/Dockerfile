FROM node:18-alpine AS build

WORKDIR /app

# Copiar los archivos de configuración
COPY package*.json ./
COPY .eslintrc.js .prettierrc ./

# Instalar dependencias
RUN npm ci

# Copiar código fuente
COPY *.js ./

# Ejecutar lint y tests
RUN npm run lint
RUN npm test
RUN npm run build

# Imagen final
FROM node:18-alpine

WORKDIR /app

# Copiar solo los archivos necesarios de la etapa de build
COPY --from=build /app/dist ./
COPY --from=build /app/package*.json ./

# Instalar solo dependencias de producción
RUN npm ci --only=production

# Comando para ejecutar la aplicación
CMD ["node", "calculator.js"]